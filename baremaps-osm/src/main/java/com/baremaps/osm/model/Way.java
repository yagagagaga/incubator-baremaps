/*
 * Copyright (C) 2011 The Baremaps Authors
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

package com.baremaps.osm.model;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Objects;
import java.util.List;

public final class Way implements Entity {

  private final Info info;

  private final List<Long> nodes;

  public Way(Info info, List<Long> nodes) {
    checkNotNull(info);
    checkNotNull(nodes);
    this.info = info;
    this.nodes = nodes;
  }

  @Override
  public Info getInfo() {
    return info;
  }

  public List<Long> getNodes() {
    return nodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Way way = (Way) o;
    return Objects.equal(info, way.info) && Objects.equal(nodes, way.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(info, nodes);
  }
}
