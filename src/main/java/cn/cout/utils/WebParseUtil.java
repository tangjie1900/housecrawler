package cn.cout.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class WebParseUtil {

	/**
	 * 判断是否是有效的URL
	 *
	 * @param strWebUrl web url 路径
	 */
	public static boolean isURLVaild(String strWebUrl) {
		HttpURLConnection httpURLConnection = null;
		try {
			URL url = new URL(strWebUrl);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestProperty("accept", "*/*");
			httpURLConnection.setRequestProperty("connection", "Keep-Alive");
			httpURLConnection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			boolean flag = httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
			return flag;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		} finally {
			if (httpURLConnection != null)
				httpURLConnection.disconnect();
		}
	}

	public static String getHtml(String strWebUrl) {
		HttpURLConnection httpURLConnection = null;
		InputStreamReader input = null;
		StringBuffer sb = new StringBuffer();
		try {
			URL url = new URL(strWebUrl);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestProperty("accept", "*/*");
			httpURLConnection.setRequestProperty("connection", "Keep-Alive");
			httpURLConnection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);

			input = new InputStreamReader(httpURLConnection.getInputStream(), "utf-8");
			BufferedReader bufReader = new BufferedReader(input);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				sb.append(line);
			}
			return sb.toString();
		} catch (Exception ex) {
			return "";
		} finally {
			if (httpURLConnection != null)
				httpURLConnection.disconnect();
		}
	}


	public static void getHtmlWithClient(String strWebUrl) {

	}


}
