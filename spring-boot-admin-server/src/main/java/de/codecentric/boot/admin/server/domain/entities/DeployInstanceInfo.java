/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.codecentric.boot.admin.server.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import de.codecentric.boot.admin.server.domain.values.JenkinsBuild;
import de.codecentric.boot.admin.server.domain.values.OperationInfo;
import de.codecentric.boot.admin.server.domain.values.StatusInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeployInstanceInfo {

	private Long id;

	private String sbaId;

	private String name;

	private Long serverId;

	private String url;

	int group;

	String branch;

	String rollbackBranch;

	String profile;

	private StatusInfo statusInfo;

	private JenkinsBuild buildInfo;

	private OperationInfo operationInfo;

	public static DeployInstanceInfo empty() {
		return new DeployInstanceInfo();
	}

}
