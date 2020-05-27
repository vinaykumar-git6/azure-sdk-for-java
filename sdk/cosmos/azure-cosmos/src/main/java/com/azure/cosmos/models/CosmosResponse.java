// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.models;

import com.azure.core.http.HttpHeaders;
import com.azure.cosmos.CosmosDiagnostics;
import com.azure.cosmos.implementation.ResourceResponse;
import com.azure.cosmos.implementation.StoredProcedureResponse;

import java.time.Duration;
import java.util.Map;

/**
 * The cosmos response
 * @param <T> the type of resource
 */
public class CosmosResponse<T> {
    private T properties;
    final ResourceResponse<?> resourceResponseWrapper;

    CosmosResponse(ResourceResponse<?> resourceResponse) {
        this.resourceResponseWrapper = resourceResponse;
    }

    CosmosResponse(T properties) {
        this.properties = properties;
        this.resourceResponseWrapper = null;
    }

    CosmosResponse(ResourceResponse<?> resourceResponse, T properties) {
        this.resourceResponseWrapper = resourceResponse;
        this.properties = properties;
    }

    // Only used in CosmosAsyncStoredProcedureResponse compatibility with StoredProcedureResponse
    CosmosResponse(StoredProcedureResponse response) {
        this.resourceResponseWrapper = null;
    }

    /**
     * Gets properties.
     *
     * @return the properties
     */
    public T getProperties() {
        return properties;
    }

    CosmosResponse<T> setProperties(T resourceSettings) {
        this.properties = resourceSettings;
        return this;
    }

    /**
     * Gets the maximum size limit for this entity (in megabytes (MB) for server resources and in count for master
     * resources).
     *
     * @return the max resource quota.
     */
    public String getMaxResourceQuota() {
        return resourceResponseWrapper.getMaxResourceQuota();
    }

    /**
     * Gets the current size of this entity (in megabytes (MB) for server resources and in count for master resources)
     *
     * @return the current resource quota usage.
     */
    public String getCurrentResourceQuotaUsage() {
        return resourceResponseWrapper.getCurrentResourceQuotaUsage();
    }

    /**
     * Gets the Activity ID for the request.
     *
     * @return the activity getId.
     */
    public String getActivityId() {
        return resourceResponseWrapper.getActivityId();
    }

    /**
     * Gets the number of index paths (terms) generated by the operation.
     *
     * @return the request charge.
     */
    public double getRequestCharge() {
        return resourceResponseWrapper.getRequestCharge();
    }

    /**
     * Gets the HTTP status code associated with the response.
     *
     * @return the status code.
     */
    public int getStatusCode() {
        return resourceResponseWrapper.getStatusCode();
    }

    /**
     * Gets the token used for managing client's consistency requirements.
     *
     * @return the session token.
     */
    public String getSessionToken() {
        return resourceResponseWrapper.getSessionToken();
    }

    /**
     * Gets the headers associated with the response.
     *
     * @return the response headers.
     */
    public HttpHeaders getResponseHeaders() {
        return resourceResponseWrapper.getResponseHeaders();
    }

    /**
     * Gets the diagnostics information for the current request to Azure Cosmos DB service.
     *
     * @return diagnostics information for the current request to Azure Cosmos DB service.
     */
    public CosmosDiagnostics getDiagnostics() {
        return resourceResponseWrapper.getDiagnostics();
    }

    /**
     * Gets the end-to-end request latency for the current request to Azure Cosmos DB service.
     *
     * @return end-to-end request latency for the current request to Azure Cosmos DB service.
     */
    public Duration getDuration() {
        return resourceResponseWrapper.getDuration();
    }
}
