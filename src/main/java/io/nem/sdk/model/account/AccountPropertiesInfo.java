/*
 * Copyright 2019 NEM
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

package io.nem.sdk.model.account;

/**
 * Account properties structure describes property information for an account.
 */
public class AccountPropertiesInfo {

    private final String metaId;
    private final AccountProperties accountProperties;

    public AccountPropertiesInfo(String metaId, AccountProperties accountProperties) {
        this.metaId = metaId;
        this.accountProperties = accountProperties;
    }

    public String getMetaId() {
        return metaId;
    }

    public AccountProperties getAccountProperties() {
        return accountProperties;
    }
}
