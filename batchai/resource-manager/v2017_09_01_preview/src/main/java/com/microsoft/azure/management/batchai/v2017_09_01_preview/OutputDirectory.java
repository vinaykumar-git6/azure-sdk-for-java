/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output directory for the job.
 */
public class OutputDirectory {
    /**
     * The name for the output directory.
     * It will be available for the job as an environment variable under
     * AZ_BATCHAI_OUTPUT_id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The prefix path where the output directory will be created.
     * NOTE: This is an absolute path to prefix. E.g.
     * $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs.
     */
    @JsonProperty(value = "pathPrefix", required = true)
    private String pathPrefix;

    /**
     * The suffix path where the output directory will be created.
     * The suffix path where the output directory will be created.
     */
    @JsonProperty(value = "pathSuffix")
    private String pathSuffix;

    /**
     * An enumeration, which specifies the type of job output directory.
     * Default value is Custom. The possible values are Model, Logs, Summary,
     * and Custom. Users can use multiple enums for a single directory. Eg.
     * outPutType='Model,Logs, Summary'. Possible values include: 'model',
     * 'logs', 'summary', 'custom'.
     */
    @JsonProperty(value = "type")
    private OutputType type;

    /**
     * True to create new directory.
     * Default is true. If false, then the directory is not created and can be
     * any directory path that the user specifies.
     */
    @JsonProperty(value = "createNew")
    private Boolean createNew;

    /**
     * Get it will be available for the job as an environment variable under AZ_BATCHAI_OUTPUT_id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set it will be available for the job as an environment variable under AZ_BATCHAI_OUTPUT_id.
     *
     * @param id the id value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get nOTE: This is an absolute path to prefix. E.g. $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs.
     *
     * @return the pathPrefix value
     */
    public String pathPrefix() {
        return this.pathPrefix;
    }

    /**
     * Set nOTE: This is an absolute path to prefix. E.g. $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs.
     *
     * @param pathPrefix the pathPrefix value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Get the suffix path where the output directory will be created.
     *
     * @return the pathSuffix value
     */
    public String pathSuffix() {
        return this.pathSuffix;
    }

    /**
     * Set the suffix path where the output directory will be created.
     *
     * @param pathSuffix the pathSuffix value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathSuffix(String pathSuffix) {
        this.pathSuffix = pathSuffix;
        return this;
    }

    /**
     * Get default value is Custom. The possible values are Model, Logs, Summary, and Custom. Users can use multiple enums for a single directory. Eg. outPutType='Model,Logs, Summary'. Possible values include: 'model', 'logs', 'summary', 'custom'.
     *
     * @return the type value
     */
    public OutputType type() {
        return this.type;
    }

    /**
     * Set default value is Custom. The possible values are Model, Logs, Summary, and Custom. Users can use multiple enums for a single directory. Eg. outPutType='Model,Logs, Summary'. Possible values include: 'model', 'logs', 'summary', 'custom'.
     *
     * @param type the type value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withType(OutputType type) {
        this.type = type;
        return this;
    }

    /**
     * Get default is true. If false, then the directory is not created and can be any directory path that the user specifies.
     *
     * @return the createNew value
     */
    public Boolean createNew() {
        return this.createNew;
    }

    /**
     * Set default is true. If false, then the directory is not created and can be any directory path that the user specifies.
     *
     * @param createNew the createNew value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withCreateNew(Boolean createNew) {
        this.createNew = createNew;
        return this;
    }

}
