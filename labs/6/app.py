"""
Requisitos para ejecutar
    *Python 3.X
    * Pip
Pasos para ejecurar
    *instalar virtual env
        pip install virtual-env
    * Crearse un entorno virtual
        python -m venv 'nombre del entorno'
    * habilitar entorno virtual
        'nombre del entorno'\Scripts\activate.bat
    * instalar requirements
        pip install -r requirements.txt
    

    *Ejecutar pruebas y coverage
        - pruebas
            python -m unittest
            python -m unittest -v
        -coverage
            coverage run -m unittest 
            coverage report
            coverage report -m
        -crear una web para ver los resultados
            coverage html
        - iniciar un server
            python -m http.server
        dirigirse a localhost:8000
"""

class Romano:
    def __init__(self, romval) -> None:
        self.romanos = {'I': 1, 'V': 5, 'X': 10,
               'L': 50, 'C': 100, 'D': 500, 'M': 1000}

        self.romval = romval.upper()

    
    def romano_to_natural_number(self):
        total,prev = 0,0
        for letra in self.romval[::-1]:
            valor = self.romanos[letra]
            total += valor if valor >= prev else -valor
            prev = valor
        return total