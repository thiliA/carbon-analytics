/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.analytics.webservice.beans;

import java.io.Serializable;

/**
 * This class represents a single entry/a single field in a drilldownresult,
 */
public class PerFieldDrillDownResultBean implements Serializable {

    private static final long serialVersionUID = 2327136897054222997L;
    private String fieldName;
    private PerCategoryDrillDownResultBean[] categories;

    public PerFieldDrillDownResultBean() {
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public PerCategoryDrillDownResultBean[] getCategories() {
        return categories;
    }

    public void setCategories(PerCategoryDrillDownResultBean[] categories) {
        this.categories = categories;
    }
}