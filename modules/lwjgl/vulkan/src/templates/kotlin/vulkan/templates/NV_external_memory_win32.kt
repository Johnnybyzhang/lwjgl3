/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val NV_external_memory_win32 = "NVExternalMemoryWin32".nativeClassVK("NV_external_memory_win32", type = "device", postfix = "NV") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables win32 applications to export win32 handles from Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them, and import win32 handles created in the Direct3D API to Vulkan memory objects.

        <h5>Examples</h5>
        <pre><code>
￿    //
￿    // Create an exportable memory object and export an external
￿    // handle from it.
￿    //
￿
￿    // Pick an external format and handle type.
￿    static const VkFormat format = VK_FORMAT_R8G8B8A8_UNORM;
￿    static const VkExternalMemoryHandleTypeFlagsNV handleType =
￿        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV;
￿
￿    extern VkPhysicalDevice physicalDevice;
￿    extern VkDevice device;
￿
￿    VkPhysicalDeviceMemoryProperties memoryProperties;
￿    VkExternalImageFormatPropertiesNV properties;
￿    VkExternalMemoryImageCreateInfoNV externalMemoryImageCreateInfo;
￿    VkDedicatedAllocationImageCreateInfoNV dedicatedImageCreateInfo;
￿    VkImageCreateInfo imageCreateInfo;
￿    VkImage image;
￿    VkMemoryRequirements imageMemoryRequirements;
￿    uint32_t numMemoryTypes;
￿    uint32_t memoryType;
￿    VkExportMemoryAllocateInfoNV exportMemoryAllocateInfo;
￿    VkDedicatedAllocationMemoryAllocateInfoNV dedicatedAllocationInfo;
￿    VkMemoryAllocateInfo memoryAllocateInfo;
￿    VkDeviceMemory memory;
￿    VkResult result;
￿    HANDLE memoryHnd;
￿
￿    // Figure out how many memory types the device supports
￿    vkGetPhysicalDeviceMemoryProperties(physicalDevice,
￿                                        &amp;memoryProperties);
￿    numMemoryTypes = memoryProperties.memoryTypeCount;
￿
￿    // Check the external handle type capabilities for the chosen format
￿    // Exportable 2D image support with at least 1 mip level, 1 array
￿    // layer, and VK_SAMPLE_COUNT_1_BIT using optimal tiling and supporting
￿    // texturing and color rendering is required.
￿    result = vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
￿        physicalDevice,
￿        format,
￿        VK_IMAGE_TYPE_2D,
￿        VK_IMAGE_TILING_OPTIMAL,
￿        VK_IMAGE_USAGE_SAMPLED_BIT |
￿        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT,
￿        0,
￿        handleType,
￿        &amp;properties);
￿
￿    if ((result != VK_SUCCESS) ||
￿        !(properties.externalMemoryFeatures &amp;
￿          VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV)) {
￿        abort();
￿    }
￿
￿    // Set up the external memory image creation info
￿    memset(&amp;externalMemoryImageCreateInfo,
￿           0, sizeof(externalMemoryImageCreateInfo));
￿    externalMemoryImageCreateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV;
￿    externalMemoryImageCreateInfo.handleTypes = handleType;
￿    if (properties.externalMemoryFeatures &amp;
￿        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) {
￿        memset(&amp;dedicatedImageCreateInfo, 0, sizeof(dedicatedImageCreateInfo));
￿        dedicatedImageCreateInfo.sType =
￿            VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV;
￿        dedicatedImageCreateInfo.dedicatedAllocation = VK_TRUE;
￿        externalMemoryImageCreateInfo.pNext = &amp;dedicatedImageCreateInfo;
￿    }
￿    // Set up the  core image creation info
￿    memset(&amp;imageCreateInfo, 0, sizeof(imageCreateInfo));
￿    imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
￿    imageCreateInfo.pNext = &amp;externalMemoryImageCreateInfo;
￿    imageCreateInfo.format = format;
￿    imageCreateInfo.extent.width = 64;
￿    imageCreateInfo.extent.height = 64;
￿    imageCreateInfo.extent.depth = 1;
￿    imageCreateInfo.mipLevels = 1;
￿    imageCreateInfo.arrayLayers = 1;
￿    imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
￿    imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
￿    imageCreateInfo.usage = VK_IMAGE_USAGE_SAMPLED_BIT |
￿        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
￿    imageCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
￿    imageCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
￿
￿    vkCreateImage(device, &amp;imageCreateInfo, NULL, &amp;image);
￿
￿    vkGetImageMemoryRequirements(device,
￿                                 image,
￿                                 &amp;imageMemoryRequirements);
￿
￿    // For simplicity, just pick the first compatible memory type.
￿    for (memoryType = 0; memoryType &lt; numMemoryTypes; memoryType++) {
￿        if ((1 &lt;&lt; memoryType) &amp; imageMemoryRequirements.memoryTypeBits) {
￿            break;
￿        }
￿    }
￿
￿    // At least one memory type must be supported given the prior external
￿    // handle capability check.
￿    assert(memoryType &lt; numMemoryTypes);
￿
￿    // Allocate the external memory object.
￿    memset(&amp;exportMemoryAllocateInfo, 0, sizeof(exportMemoryAllocateInfo));
￿    exportMemoryAllocateInfo.sType =
￿        VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV;
￿    exportMemoryAllocateInfo.handleTypes = handleType;
￿    if (properties.externalMemoryFeatures &amp;
￿        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) {
￿        memset(&amp;dedicatedAllocationInfo, 0, sizeof(dedicatedAllocationInfo));
￿        dedicatedAllocationInfo.sType =
￿            VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV;
￿        dedicatedAllocationInfo.image = image;
￿        exportMemoryAllocateInfo.pNext = &amp;dedicatedAllocationInfo;
￿    }
￿    memset(&amp;memoryAllocateInfo, 0, sizeof(memoryAllocateInfo));
￿    memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
￿    memoryAllocateInfo.pNext = &amp;exportMemoryAllocateInfo;
￿    memoryAllocateInfo.allocationSize = imageMemoryRequirements.size;
￿    memoryAllocateInfo.memoryTypeIndex = memoryType;
￿
￿    vkAllocateMemory(device, &amp;memoryAllocateInfo, NULL, &amp;memory);
￿
￿    if (!(properties.externalMemoryFeatures &amp;
￿          VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV)) {
￿        vkBindImageMemory(device, image, memory, 0);
￿    }
￿
￿    // Get the external memory opaque FD handle
￿    vkGetMemoryWin32HandleNV(device, memory, &amp;memoryHnd);</code></pre>

        <h5>VK_NV_external_memory_win32</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_external_memory_win32}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>58</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link NVExternalMemory VK_NV_external_memory} to be enabled for any device-level functionality</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> by {@link KHRExternalMemoryWin32 VK_KHR_external_memory_win32} extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_external_memory_win32]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_external_memory_win32%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-19</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_NV_external_memory_win32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057001"
    )

    VkResult(
        "GetMemoryWin32HandleNV",
        """
        Retrieve Win32 handle to a device memory object.

        <h5>C Specification</h5>
        To retrieve the handle corresponding to a device memory object created with ##VkExportMemoryAllocateInfoNV{@code ::handleTypes} set to include #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV or #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV, call:

        <pre><code>
￿VkResult vkGetMemoryWin32HandleNV(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkExternalMemoryHandleTypeFlagsNV           handleType,
￿    HANDLE*                                     pHandle);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be a flag specified in ##VkExportMemoryAllocateInfoNV{@code ::handleTypes} when allocating {@code memory}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
            <li>{@code handleType} <b>must</b> not be 0</li>
            <li>{@code pHandle} <b>must</b> be a valid pointer to a {@code HANDLE} value</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkDeviceMemory("memory", "the {@code VkDeviceMemory} object."),
        VkExternalMemoryHandleTypeFlagsNV("handleType", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a single bit specifying the type of handle requested."),
        Check(1)..HANDLE.p("pHandle", "")
    )
}