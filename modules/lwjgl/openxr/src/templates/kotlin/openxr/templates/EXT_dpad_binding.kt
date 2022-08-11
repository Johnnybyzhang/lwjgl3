/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_dpad_binding = "EXTDpadBinding".nativeClassXR("EXT_dpad_binding", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_dpad_binding_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DPAD_BINDING_EXTENSION_NAME".."XR_EXT_dpad_binding"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT".."1000078000"
    )
}