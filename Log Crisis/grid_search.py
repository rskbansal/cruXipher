import numpy as np
import json
import time
import concurrent.futures
import random
from multiprocessing import Process, Manager
from pprint import PrettyPrinter
from itertools import product


"""
Example of how the model class looks like
"""
class Model():
  def __init__(self, degree, a, b, epochs):
    pass
    return

  def get_logs(self):
    pass

  def train(self, train, test):
    pass

def generate_random_string(length):
    characters = "0123456789abcdef"
    random_string = ''.join(random.choice(characters) for _ in range(length))
    return random_string

"""
example return value of get_logs()
{
  'weights': np.random.random((degree+1, 1)).tolist(),
  'text': generate_random_string(44),
  'errors': np.array(errors).reshape(self.epochs, 1).tolist(),
}
"""

logs = []
train = []
test = []
degrees = range(2)
multipliers = [i * 0.1 for i in range(3)]
factors = [0.5, 1, 2, 3]
epochs = 500
for deg, a, b in product(degrees, multipliers, factors):
  model = Model(deg, a, b, epochs)
  model.train(train, test)
  tmp = model.get_logs()
  logs.append({
      'a': a,
      'b': b,
      'deg': deg,
      'weights': tmp['weights'],
      'errors': tmp['errors'],
      'text': tmp['text']
      })

pp = PrettyPrinter(indent=4)
pp.pprint(logs)

logs = json.dumps(logs)

with open('output.json', 'a') as file:
    json.dump(logs, file)