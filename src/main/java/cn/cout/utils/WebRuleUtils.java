package cn.cout.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebRuleUtils {

	public static String getWebRule(String regex, String input, String citynameWenAbb) {
		String returnValue = input;
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(input);
		while (m.find()) {
			String match_ed = m.group(0);
			returnValue = returnValue.replace(match_ed, citynameWenAbb);
		}
		return returnValue;
	}


}
