/**
 * TestCube is an enterprise Test management tool.
 * Copyright (C) 2011 JatakaSource Ltd.
 *
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TestCube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TestCube.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jatakasource.testcube.model.product;

import org.jatakasource.testcube.model.ProductRelatedPojo;

public class BuildPojo extends ProductRelatedPojo implements IBuild {
	private static final long serialVersionUID = -5332486024222827728L;

	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}