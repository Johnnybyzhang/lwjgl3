/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The FB_composition_layer_settings extension. */
public final class FBCompositionLayerSettings {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_settings_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_SETTINGS_EXTENSION_NAME = "XR_FB_composition_layer_settings";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB = 1000204000;

    /**
     * XrCompositionLayerSettingsFlagBitsFB
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB}</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB}</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB}</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB}</li>
     * </ul>
     */
    public static final int
        XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB  = 0x1,
        XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB = 0x2,
        XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB      = 0x4,
        XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB     = 0x8;

    private FBCompositionLayerSettings() {}

}