/*
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
package com.teradata.tempto.examples;

import com.teradata.tempto.ProductTest;
import org.testng.annotations.Test;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import static org.assertj.core.api.Assertions.assertThat;

public class HostNameMappingTest
        extends ProductTest
{
    @Test(groups = "dns")
    public void localhostAlias()
            throws UnknownHostException
    {
        assertThat(Inet4Address.getAllByName("localhost_alias")).isEqualTo(Inet4Address.getAllByName("localhost"));
        assertThat(Inet4Address.getAllByName("teradata_alias")).isEqualTo(Inet4Address.getAllByName("teradata.com"));
    }
}