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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteColumnStatisticsForTable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteColumnStatisticsForTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String columnName;

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *         ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteColumnStatisticsForTableRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @return The name of the catalog database where the partitions reside.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteColumnStatisticsForTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @return The name of the partitions' table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteColumnStatisticsForTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param columnName
     *        The name of the column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param columnName
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteColumnStatisticsForTableRequest withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteColumnStatisticsForTableRequest == false)
            return false;
        DeleteColumnStatisticsForTableRequest other = (DeleteColumnStatisticsForTableRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteColumnStatisticsForTableRequest clone() {
        return (DeleteColumnStatisticsForTableRequest) super.clone();
    }

}
