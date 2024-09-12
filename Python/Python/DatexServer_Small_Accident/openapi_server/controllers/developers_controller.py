import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.exchanghe_information import ExchangheInformation  # noqa: E501
from openapi_server.models.message_container import MessageContainer  # noqa: E501
from openapi_server.models.situation import Situation  # noqa: E501
from openapi_server import util


def keep_alive():  # noqa: E501
    """DATEX II snapshot pull

    Keepalive  # noqa: E501


    :rtype: Union[ExchangheInformation, Tuple[ExchangheInformation, int], Tuple[ExchangheInformation, int, Dict[str, str]]
    """
    return 'do some magic!'


def snapshot_pull():  # noqa: E501
    """DATEX II snapshot pull

    Snapshot pull DATEX II API # noqa: E501


    :rtype: Union[MessageContainer, Tuple[MessageContainer, int], Tuple[MessageContainer, int, Dict[str, str]]
    """
    return 'do some magic!'


def snapshot_pull_situation(id):  # noqa: E501
    """DATEX II snapshot pull situation

    Snapshot pull situation DATEX II API # noqa: E501

    :param id: Id of Situation
    :type id: str

    :rtype: Union[Situation, Tuple[Situation, int], Tuple[Situation, int, Dict[str, str]]
    """
    return 'do some magic!'
