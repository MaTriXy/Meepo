/*
 * Copyright 2017. nekocode (nekocode.cn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.nekocode.meepo.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import cn.nekocode.meepo.CallMethod;
import cn.nekocode.meepo.config.Config;

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
public interface CallAdapter<T> {

    @Nullable
    T call(@NonNull Config config, @NonNull CallMethod method, @NonNull Object[] args);
}
