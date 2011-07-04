/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.urish.gwtit.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Base class for bootstrapping into a node.js program. It is
 * recommended that this class is extended and {@link #main(String...)}
 * implemented to begin a node.js program.
 * 
 * @author Chad Retz
 */
public abstract class GwtTitaniumBootstrap implements EntryPoint {

    
    @Override
    public final void onModuleLoad() {
        //call the main method
        Runner runner = GWT.create(Runner.class);
        runner.run(this);
    }
    
    public abstract Integer main();
}
