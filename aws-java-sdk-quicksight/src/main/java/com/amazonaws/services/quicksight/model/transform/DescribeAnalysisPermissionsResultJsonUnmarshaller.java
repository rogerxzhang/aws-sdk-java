/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAnalysisPermissionsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnalysisPermissionsResultJsonUnmarshaller implements Unmarshaller<DescribeAnalysisPermissionsResult, JsonUnmarshallerContext> {

    public DescribeAnalysisPermissionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAnalysisPermissionsResult describeAnalysisPermissionsResult = new DescribeAnalysisPermissionsResult();

        describeAnalysisPermissionsResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAnalysisPermissionsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AnalysisId", targetDepth)) {
                    context.nextToken();
                    describeAnalysisPermissionsResult.setAnalysisId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnalysisArn", targetDepth)) {
                    context.nextToken();
                    describeAnalysisPermissionsResult.setAnalysisArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Permissions", targetDepth)) {
                    context.nextToken();
                    describeAnalysisPermissionsResult.setPermissions(new ListUnmarshaller<ResourcePermission>(ResourcePermissionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    describeAnalysisPermissionsResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAnalysisPermissionsResult;
    }

    private static DescribeAnalysisPermissionsResultJsonUnmarshaller instance;

    public static DescribeAnalysisPermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAnalysisPermissionsResultJsonUnmarshaller();
        return instance;
    }
}
