/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows specifying separate usage flags for the stencil aspect of images with a depth-stencil format at image creation time.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_separate_stencil_usage}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>247</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_separate_stencil_usage:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-11-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jordan Logan, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTSeparateStencilUsage {

    /** The extension specification version. */
    public static final int VK_EXT_SEPARATE_STENCIL_USAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SEPARATE_STENCIL_USAGE_EXTENSION_NAME = "VK_EXT_separate_stencil_usage";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT = 1000246000;

    private EXTSeparateStencilUsage() {}

}