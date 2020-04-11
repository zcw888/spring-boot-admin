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

package de.codecentric.boot.admin.server.domain.values;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import de.codecentric.boot.admin.server.domain.DeployServer;
import de.codecentric.boot.admin.server.domain.LoginType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerInfo {

	Long id;

	Long environmentId;

	String name;

	String ip;

	LoginType loginType;

	String user;

	List<Long> children;

	public ServerInfo(Long id, String name, String ip) {
		this.id = id;
		this.name = name;
		this.ip = ip;
	}

	public ServerInfo(Long id, Long environmentId, String name, String ip, LoginType loginType, String user) {
		this.id = id;
		this.environmentId = environmentId;
		this.name = name;
		this.ip = ip;
		this.loginType = loginType;
		this.user = user;
	}

	public static ServerInfo fromEntity(DeployServer server) {
		return new ServerInfo(server.getId(), server.getEnvironmentId(), server.getName(), server.getIp(),
				server.getLoginType(), server.getUser());
	}

}
