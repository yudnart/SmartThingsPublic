/**
 *  Web API
 *
 *  Copyright 2018 Duy Tran
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Web API",
    namespace: "WebApi",
    author: "Duy Tran",
    description: "Enable device management via web services.",
    category: "SmartThings Labs",
    iconUrl: "https://iotsyst.com/wp-content/uploads/2017/06/sense_q_edge_350_2.png",
    iconX2Url: "https://iotsyst.com/wp-content/uploads/2017/06/sense_q_edge_350_2.png",
    iconX3Url: "https://iotsyst.com/wp-content/uploads/2017/06/sense_q_edge_350_2.png")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers