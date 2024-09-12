import unittest

from flask import json

from openapi_server.models.exchanghe_information import ExchangheInformation  # noqa: E501
from openapi_server.models.message_container import MessageContainer  # noqa: E501
from openapi_server.models.situation import Situation  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDevelopersController(BaseTestCase):
    """DevelopersController integration test stubs"""

    def test_keep_alive(self):
        """Test case for keep_alive

        DATEX II snapshot pull
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/datexpull/1.0.2/keepalive',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_snapshot_pull(self):
        """Test case for snapshot_pull

        DATEX II snapshot pull
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/datexpull/1.0.2/pull',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_snapshot_pull_situation(self):
        """Test case for snapshot_pull_situation

        DATEX II snapshot pull situation
        """
        query_string = [('id', 'id_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/datexpull/1.0.2/pullsituation',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
