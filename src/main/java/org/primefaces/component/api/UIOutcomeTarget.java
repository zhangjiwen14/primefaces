/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.api;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;

public interface UIOutcomeTarget {

    public String getOutcome();

    public boolean isIncludeViewParams();

    public String getFragment();

    public List<UIComponent> getChildren();

    public Map<String, List<String>> getParams();

    public String getHref();

    public boolean isDisableClientWindow();
}
