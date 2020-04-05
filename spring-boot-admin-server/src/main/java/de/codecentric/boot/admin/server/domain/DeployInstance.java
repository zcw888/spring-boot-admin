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

package de.codecentric.boot.admin.server.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "ifp_deploy_instance")
public class DeployInstance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	Long serviceId;

	Long serverId;

	int group;

	String branch;

	String rollbackBranch;

	String profile;

	String queueId;

	Date lastDeployTime;

	String lastBuildId;

//	@ManyToOne(fetch = FetchType.LAZY, targetEntity = MicroService.class)
//	@JoinColumn(name = "serviceId", insertable = false, updatable = false)
//	private MicroService service;

//	@ManyToOne(fetch = FetchType.LAZY, targetEntity = DeployServer.class)
//	@JoinColumn(name = "serverId", insertable = false, updatable = false)
//	private DeployServer server;

	public DeployInstance(Long serviceId, Long serverId) {
		this.serviceId = serviceId;
		this.serverId = serverId;
	}

}
