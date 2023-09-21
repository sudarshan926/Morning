package com.name;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program2 {
	public static void main(String[] args) {

		String logDirectoryPath = "logs/";

		String searchTimestampStr = "2023-06-29 04:04:04";

		String jobNameToSearch = "J1";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date searchTimestamp = null;
		try {
			searchTimestamp = dateFormat.parse(searchTimestampStr);
		} catch (ParseException e) {
			System.err.println("Invalid search timestamp format. Use yyyy-MM-dd HH:mm:ss.");
			System.exit(1);
		}

		try {

			for (int i = 1; i <= 100; i++) {
				String logFilePath = logDirectoryPath + "S" + i + "-p1-logfile.log";
				try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
					String line;
					while ((line = br.readLine()) != null) {
						if (line.contains(jobNameToSearch)) {

							String timestampStr = line.substring(0, 19);
							Date logTimestamp = dateFormat.parse(timestampStr);

							if (logTimestamp.after(searchTimestamp)) {
								System.out.println(line);
								System.exit(0);
							}
						}
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading log files: " + e.getMessage());
		} catch (ParseException e) {
			System.err.println("Error parsing timestamps: " + e.getMessage());
		}

		System.out.println("No matching log entry found.");
	}
}
