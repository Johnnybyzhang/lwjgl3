/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_incremental_present = "KHRIncrementalPresent".nativeClassVK("KHR_incremental_present", type = "device", postfix = "KHR") {
    documentation =
        """
        This device extension extends #QueuePresentKHR(), from the {@link KHRSwapchain VK_KHR_swapchain} extension, allowing an application to specify a list of rectangular, modified regions of each image to present. This should be used in situations where an application is only changing a small portion of the presentable images within a swapchain, since it enables the presentation engine to avoid wasting time presenting parts of the surface that have not changed.

        This extension is leveraged from the {@code EGL_KHR_swap_buffers_with_damage} extension.

        <h5>VK_KHR_incremental_present</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_incremental_present}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>85</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain} to be enabled for any device-level functionality</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ian Elliott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_incremental_present]%20@ianelliottus%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_incremental_present%20extension%3E%3E">ianelliottus</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-11-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>Jesse Hall, Google</li>
                <li>Alon Or-bach, Samsung</li>
                <li>James Jones, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Ray Smith, ARM</li>
                <li>Mika Isojarvi, Google</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_INCREMENTAL_PRESENT_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_INCREMENTAL_PRESENT_EXTENSION_NAME".."VK_KHR_incremental_present"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PRESENT_REGIONS_KHR".."1000084000"
    )
}