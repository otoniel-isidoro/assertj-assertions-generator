/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.assertions.generator.description;

/**
 * base class to describe a field or a property/getter
 */
public abstract class DataDescription {

  protected final TypeDescription typeDescription;
  private final String name;

  public DataDescription(String name, TypeDescription typeDescription) {
	super();
	this.name = name;
	this.typeDescription = typeDescription;
  }

  public String getName() {
	return name;
  }

  public String getTypeName() {
	return typeDescription.getSimpleNameWithOuterClass();
  }

  public boolean isIterableType() {
	return typeDescription.isIterable();
  }

  public boolean isArrayType() {
	return typeDescription.isArray();
  }

  public boolean isPrimitiveType() {
	return typeDescription.isPrimitive();
  }

  public boolean isRealNumberType() {
	return typeDescription.isRealNumber();
  }

  public boolean isBooleanType() {
	return typeDescription.isBoolean();
  }

  public boolean isDateType() {
	return typeDescription.isDate();
  }
  /**
   * return the simple element type name if etement type belongs to given the package and the fully qualified element
   * type name ortherwise.
   * 
   * @param packageName typically the package of the enclosing Class
   * @return the simple element type name if etement type belongs to given the package and the fully qualified element
   * type name ortherwise.
   */
  public String getElementTypeName(String packageName) {
	return typeDescription.getElementTypeName() == null ? null
	    : typeDescription.getElementTypeName().getFullyQualifiedTypeNameIfNeeded(packageName);
  }

  public String getFullyQualifiedTypeNameIfNeeded(String packageName) {
	return typeDescription.getFullyQualifiedTypeNameIfNeeded(packageName);
  }

}