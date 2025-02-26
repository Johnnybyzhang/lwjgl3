/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_vive_focus3_controller_interaction = "HTCViveFocus3ControllerInteraction".nativeClassXR("HTC_vive_focus3_controller_interaction", type = "instance", postfix = "HTC") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_vive_focus3_controller_interaction_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "HTC_VIVE_FOCUS3_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_HTC_vive_focus3_controller_interaction"
    )
}