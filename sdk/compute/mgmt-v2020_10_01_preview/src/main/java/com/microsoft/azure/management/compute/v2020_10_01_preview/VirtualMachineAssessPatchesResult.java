/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.VirtualMachineAssessPatchesResultInner;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing VirtualMachineAssessPatchesResult.
 */
public interface VirtualMachineAssessPatchesResult extends HasInner<VirtualMachineAssessPatchesResultInner>, HasManager<ComputeManager> {
    /**
     * @return the assessmentActivityId value.
     */
    String assessmentActivityId();

    /**
     * @return the criticalAndSecurityPatchCount value.
     */
    Integer criticalAndSecurityPatchCount();

    /**
     * @return the error value.
     */
    ApiError error();

    /**
     * @return the otherPatchCount value.
     */
    Integer otherPatchCount();

    /**
     * @return the patches value.
     */
    List<VirtualMachineSoftwarePatchProperties> patches();

    /**
     * @return the rebootPending value.
     */
    Boolean rebootPending();

    /**
     * @return the startDateTime value.
     */
    DateTime startDateTime();

    /**
     * @return the status value.
     */
    PatchOperationStatus status();

}
