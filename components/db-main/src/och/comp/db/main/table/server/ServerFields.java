/*
 * Copyright 2015 Evgeny Dolganov (evgenij.dolganov@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package och.comp.db.main.table.server;

import och.comp.db.base.universal.SelectFields;
import och.comp.db.main.table._f.HttpUrl;
import och.comp.db.main.table._f.HttpsUrl;
import och.comp.db.main.table._f.Id;
import och.comp.db.main.table._f.IsFull;

public class ServerFields extends SelectFields{

	public ServerFields() {
		super(
			Id.class, 
			HttpUrl.class, 
			HttpsUrl.class,
			IsFull.class);
	}
	
	

}
