/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Product information.
 */
public class VirtualMachineProductProperties {
    /**
     * Specifies product version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * OS disk image used by product.
     */
    @JsonProperty(value = "osDiskImage", access = JsonProperty.Access.WRITE_ONLY)
    private OsDiskImage osDiskImage;

    /**
     * List of attached data disks.
     */
    @JsonProperty(value = "dataDiskImages", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataDiskImage> dataDiskImages;

    /**
     * Get specifies product version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get oS disk image used by product.
     *
     * @return the osDiskImage value
     */
    public OsDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Get list of attached data disks.
     *
     * @return the dataDiskImages value
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

}
