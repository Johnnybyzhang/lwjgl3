/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain_mutable_format = "KHRSwapchainMutableFormat".nativeClassVK("KHR_swapchain_mutable_format", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows processing of swapchain images as different formats to that used by the window system, which is particularly useful for switching between sRGB and linear RGB formats.

        It adds a new swapchain creation flag that enables creating image views from presentable images with a different format than the one used to create the swapchain.

        <h5>VK_KHR_swapchain_mutable_format</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_swapchain_mutable_format}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>201</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain} to be enabled for any device-level functionality</li>
                <li>Requires {@link KHRMaintenance2 VK_KHR_maintenance2} to be enabled for any device-level functionality</li>
                <li>Requires {@link KHRImageFormatList VK_KHR_image_format_list} to be enabled for any device-level functionality</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_swapchain_mutable_format]%20@drakos-arm%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_swapchain_mutable_format%20extension%3E%3E">drakos-arm</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-03-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jason Ekstrand, Intel</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Jesse Hall, Google</li>
                <li>Daniel Rakos, AMD</li>
                <li>Ray Smith, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SWAPCHAIN_MUTABLE_FORMAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SWAPCHAIN_MUTABLE_FORMAT_EXTENSION_NAME".."VK_KHR_swapchain_mutable_format"
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR".enum(0x00000004)
    )
}