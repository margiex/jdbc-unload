/*******************************************************************************
 * Copyright 2017 Mieras Made
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
 ******************************************************************************/
package nl.mierasmade.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import nl.mierasmade.table.TableDefinition;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
@ConfigurationProperties
public class ExternalConfiguration {	

	@NotNull
	private String outputDir;
	@NotNull
	private char delimiter;
	@NotNull
	private char quote;
	@NotNull
	private char quoteEscape;
	@NotNull
	@Max(10_000)
	private int commitInterval;
	@Max(1000)
	private int pageSize;
	@NotEmpty
	private List<TableDefinition> tableDefinitions = new ArrayList<>();
	
	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public char getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(char delimiter) {
		this.delimiter = delimiter;
	}	

	public char getQuote() {
		return quote;
	}

	public void setQuote(char quote) {
		this.quote = quote;
	}	

	public char getQuoteEscape() {
		return quoteEscape;
	}

	public void setQuoteEscape(char quoteEscape) {
		this.quoteEscape = quoteEscape;
	}

	public int getCommitInterval() {
		return commitInterval;
	}

	public void setCommitInterval(int commitInterval) {
		this.commitInterval = commitInterval;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<TableDefinition> getTableDefinitions() {
		return tableDefinitions;
	}	
}
