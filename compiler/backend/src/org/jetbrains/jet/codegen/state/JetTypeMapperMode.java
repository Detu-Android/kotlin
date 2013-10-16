/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.codegen.state;

public enum JetTypeMapperMode {
    /**
     * foo.Bar is mapped to Lfoo/Bar;
     */
    IMPL,
    /**
     * jet.Int is mapped to I
     */
    VALUE,
    /**
     * jet.Int is mapped to Ljava/lang/Integer;
     */
    TYPE_PARAMETER,
    /**
     * jet.Int is mapped to Ljava/lang/Integer;
     * No projections allowed in immediate arguments
     */
    SUPER_TYPE
}
