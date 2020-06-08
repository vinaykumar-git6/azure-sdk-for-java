// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OnErrorDeploymentType. */
public enum OnErrorDeploymentType {
    /** Enum value LastSuccessful. */
    LAST_SUCCESSFUL("LastSuccessful"),

    /** Enum value SpecificDeployment. */
    SPECIFIC_DEPLOYMENT("SpecificDeployment");

    /** The actual serialized value for a OnErrorDeploymentType instance. */
    private final String value;

    OnErrorDeploymentType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OnErrorDeploymentType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OnErrorDeploymentType object, or null if unable to parse.
     */
    @JsonCreator
    public static OnErrorDeploymentType fromString(String value) {
        OnErrorDeploymentType[] items = OnErrorDeploymentType.values();
        for (OnErrorDeploymentType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}