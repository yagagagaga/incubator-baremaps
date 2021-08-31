/*
 * Copyright (C) 2020 The Baremaps Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.baremaps.blob;

/** Signals that an exception occurred in a {@code BlobMapper}. */
public class BlobMapperException extends Exception {

  /** Constructs a {@code BlobMapperException} with {@code null} as its error detail message. */
  public BlobMapperException() {}

  /**
   * Constructs an {@code BlobMapperException} with the specified detail message.
   *
   * @param message the message
   */
  public BlobMapperException(String message) {
    super(message);
  }

  /**
   * Constructs a {@code BlobMapperException} with the specified cause.
   *
   * @param cause the cause
   */
  public BlobMapperException(Throwable cause) {
    super(cause);
  }

  /**
   * Constructs a {@code BlobMapperException} with the specified detail message and cause.
   *
   * @param message the message
   * @param cause the cause
   */
  public BlobMapperException(String message, Throwable cause) {
    super(message, cause);
  }
}
