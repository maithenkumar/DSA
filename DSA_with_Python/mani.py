
from selenium.webdriver.chromium.webdriver import ChromiumDriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

from .options import Options
from .service import Service


class WebDriver(ChromiumDriver):
    """Controls the ChromeDriver and allows you to drive the browser."""

    def _init_(
        self,
        options: Options = None,
        service: Service = None,
        keep_alive: bool = True,
    ) -> None:
        """Creates a new instance of the chrome driver. Starts the service and
        then creates new instance of chrome driver.

        :Args:
         - options - this takes an instance of ChromeOptions
         - service - Service object for handling the browser driver if you need to pass extra details
         - keep_alive - Whether to configure ChromeRemoteConnection to use HTTP keep-alive.
        """
        service = service if service else Service()
        options = options if options else Options()

        super().__init__(
            DesiredCapabilities.CHROME["browserName"],
            "goog",
            options,
            service,
            keep_alive,
        )


def get(source1):
    return None