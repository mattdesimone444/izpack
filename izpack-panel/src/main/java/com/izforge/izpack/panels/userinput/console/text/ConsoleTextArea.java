/*
 * IzPack - Copyright 2001-2012 Julien Ponge, All Rights Reserved.
 *
 * http://izpack.org/
 * http://izpack.codehaus.org/
 *
 * Copyright 2020 Patrick Reinhart
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

package com.izforge.izpack.panels.userinput.console.text;

import com.izforge.izpack.api.handler.Prompt;
import com.izforge.izpack.panels.userinput.console.ConsoleInputField;
import com.izforge.izpack.panels.userinput.field.text.TextArea;
import com.izforge.izpack.panels.userinput.field.text.TextField;
import com.izforge.izpack.util.Console;


/**
 * Console presentation of {@link TextField}.
 *
 * @author Patrick Reinhart
 */
public class ConsoleTextArea extends ConsoleInputField
{
    /**
     * Constructs a {@code ConsoleTextField}.
     *
     * @param field   the field
     * @param console the console
     * @param prompt  the prompt
     */
    public ConsoleTextArea(TextArea field, Console console, Prompt prompt)
    {
        super(field, console, prompt);
    }

}
