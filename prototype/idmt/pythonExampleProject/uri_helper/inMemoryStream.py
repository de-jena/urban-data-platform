from io import BytesIO

from pyecore.resources import URI


class InMemoryURI(URI):
    def __init__(self, uri,data = None):
        super(InMemoryURI, self).__init__(uri)
        self.__stream = BytesIO()
        if data is not None:
            self.__stream = BytesIO(data)

    def getvalue(self):
        return self.__stream.getvalue()

    def create_instream(self):
        return self.__stream

    def create_outstream(self):
        self.__stream = BytesIO()
        return self.__stream
