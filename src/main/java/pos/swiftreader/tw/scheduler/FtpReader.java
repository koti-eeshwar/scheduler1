package pos.swiftreader.tw.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class FtpReader {

	private static final Logger logger = LoggerFactory.getLogger(FtpReader.class);
	SimpleDateFormat dateFormat = null;
	
	public FtpReader() {
		dateFormat  = new SimpleDateFormat();
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
		
	@Scheduled(cron = "${schedule}")
	public void scan() {
		
		logger.info("Scheduler running.. ", dateFormat.format(new Date()));
		
		System.out.println("Scheduler running.. "+ dateFormat.format(new Date()));
	}
}
