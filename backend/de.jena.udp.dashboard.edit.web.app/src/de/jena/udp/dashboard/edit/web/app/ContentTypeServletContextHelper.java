/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.dashboard.edit.web.app;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.context.ServletContextHelper;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContext;

@Component(name="ContentTypeServletContextHelper", service = ServletContextHelper.class, scope = ServiceScope.SINGLETON)
@HttpWhiteboardContext(name = "upd-dashboard", path = "/html/dashboard")
public class ContentTypeServletContextHelper extends ServletContextHelper {

	
	@Activate
	public ContentTypeServletContextHelper(final BundleContext ctx) {
		super(ctx.getBundle());
	}

	@Override
	public String getMimeType(String name) {
		if(name.indexOf('.') != -1 ) {
			return MIME.get(name.substring(name.lastIndexOf(".")));
		}
		return null;
	}
	
	@SuppressWarnings("serial")
	private static final Map<String, String> MIME = new HashMap<String, String>() {
		{
			put(".aac", "audio/aac");
			put(".abw", "application/x-abiword");
			put(".arc", "application/octet-stream");
			put(".avi", "video/x-msvideo");
			put(".azw", "application/vnd.amazon.ebook");
			put(".bin", "application/octet-stream");
			put(".bz", "application/x-bzip");
			put(".bz2", "application/x-bzip2");
			put(".csh", "application/x-csh");
			put(".css", "text/css");
			put(".csv", "text/csv");
			put(".doc", "application/msword");
			put(".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
			put(".eot", "application/vnd.ms-fontobject");
			put(".epub", "application/epub+zip");
			put(".gif", "image/gif");
			put(".htm", "text/html");
			put(".html", "text/html");
			put(".ico", "image/x-icon");
			put(".ics", "text/calendar");
			put(".jar", "application/java-archive");
			put(".jpeg", "image/jpeg");
			put(".jpg", "image/jpeg");
			put(".js", "application/javascript");
			put(".json", "application/json");
			put(".mid", "audio/midi");
			put(".midi", "audio/midi");
			put(".mpeg", "video/mpeg");
			put(".mpkg", "application/vnd.apple.installer+xml");
			put(".odp", "application/vnd.oasis.opendocument.presentation");
			put(".ods", "application/vnd.oasis.opendocument.spreadsheet");
			put(".odt", "application/vnd.oasis.opendocument.text");
			put(".oga", "audio/ogg");
			put(".ogv", "video/ogg");
			put(".ogx", "application/ogg");
			put(".otf", "font/otf");
			put(".png", "image/png");
			put(".pdf", "application/pdf");
			put(".ppt", "application/vnd.ms-powerpoint");
			put(".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
			put(".rar", "application/x-rar-compressed");
			put(".rtf", "application/rtf");
			put(".sh", "application/x-sh");
			put(".svg", "image/svg+xml");
			put(".swf", "application/x-shockwave-flash");
			put(".tar", "application/x-tar");
			put(".tif", "image/tiff");
			put(".tiff", "image/tiff");
			put(".ts", "application/typescript");
			put(".ttf", "font/ttf");
			put(".vsd", "application/vnd.visio");
			put(".wav", "audio/x-wav");
			put(".weba", "audio/webm");
			put(".webm", "video/webm");
			put(".webp", "image/webp");
			put(".woff", "font/woff");
			put(".woff2", "font/woff2");
			put(".xhtml", "application/xhtml+xml");
			put(".xls", "application/vnd.ms-excel");
			put(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			put(".xml", "application/xml");
			put(".xul", "application/vnd.mozilla.xul+xml");
			put(".zip", "application/zip");
			put(".7z", "application/x-7z-compressed");
		}
	};

}
