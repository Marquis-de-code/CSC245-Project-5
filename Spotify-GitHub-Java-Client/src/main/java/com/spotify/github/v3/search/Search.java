/*-
 * -\-\-
 * github-api
 * --
 * Copyright (C) 2016 - 2020 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.github.v3.search;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.github.GithubStyle;
import javax.annotation.Nullable;
import org.immutables.value.Value;

/**
 * Search result base resource. This base entity for specific search result resources exists to
 * overcome gson generics serialization issues.
 */
@Value.Immutable
@GithubStyle
@JsonSerialize(as = ImmutableSearch.class)
@JsonDeserialize(as = ImmutableSearch.class)
public interface Search {

  /** Total count of search hits */
  @Nullable
  Integer totalCount();

  /** Are returned results incomplete */
  @Nullable
  Boolean incompleteResults();
}
