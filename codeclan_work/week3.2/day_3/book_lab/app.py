from flask import Flask
from controllers.books_controllers import books_blueprint 

app = Flask (__name__)

app.register_blueprint(books_blueprint)