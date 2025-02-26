/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MVK_macos_surface = "MVKMacosSurface".nativeClassVK("MVK_macos_surface", type = "instance", postfix = "MVK") {
    documentation =
        """
        The {@code VK_MVK_macos_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) based on an {@code NSView}, the native surface type of macOS, which is underpinned by a {@code CAMetalLayer}, to support rendering to the surface using Apple’s Metal framework.

        <h5>Deprecation by {@code VK_EXT_metal_surface}</h5>
        The {@code VK_MVK_macos_surface} extension is considered deprecated and has been superseded by the {@link EXTMetalSurface VK_EXT_metal_surface} extension.

        <h5>VK_MVK_macos_surface</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_MVK_macos_surface}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>124</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface} to be enabled</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> by {@link EXTMetalSurface VK_EXT_metal_surface} extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Bill Hollings <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_MVK_macos_surface]%20@billhollings%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_MVK_macos_surface%20extension%3E%3E">billhollings</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-31</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "MVK_MACOS_SURFACE_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "MVK_MACOS_SURFACE_EXTENSION_NAME".."VK_MVK_macos_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK".."1000123000"
    )

    VkResult(
        "CreateMacOSSurfaceMVK",
        """
        Create a VkSurfaceKHR object for a macOS NSView.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for a macOS {@code NSView} or {@code CAMetalLayer}, call:

        <pre><code>
￿VkResult vkCreateMacOSSurfaceMVK(
￿    VkInstance                                  instance,
￿    const VkMacOSSurfaceCreateInfoMVK*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code vkCreateMacOSSurfaceMVK} function is considered deprecated and has been superseded by #CreateMetalSurfaceEXT() from the {@link EXTMetalSurface VK_EXT_metal_surface} extension.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkMacOSSurfaceCreateInfoMVK structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkMacOSSurfaceCreateInfoMVK
        """,

        VkInstance("instance", "the instance with which to associate the surface."),
        VkMacOSSurfaceCreateInfoMVK.const.p("pCreateInfo", "a pointer to a ##VkMacOSSurfaceCreateInfoMVK structure containing parameters affecting the creation of the surface object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p("pSurface", "a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )
}