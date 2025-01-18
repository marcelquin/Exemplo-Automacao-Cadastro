import pandas as pd
import requests

tabela = pd.read_csv("arquivo.csv")
url_api = "http://localhost:8080/cliente/NovoCliente"

for linha in tabela.index:
    nome = tabela.loc[linha, "Nome"]
    email = tabela.loc[linha, "Email"]
    
    headers = {
    'Content-Type': 'application/json',
    'Accept': 'application/json'
}
    params = {
        'nome': nome,
        'email': email
    }

    try:
        resposta = requests.post(
            url=url_api,
            json=params,
            headers=headers,
            params=params,
            timeout=30  # Timeout em segundos
        )
        
        if resposta.status_code == 200:
            print(f"Dados da linha {linha} enviados com sucesso!")
        else:
            print(f"Erro ao enviar dados da linha {linha}. Status code: {resposta.status_code}")
            
    except requests.Timeout:
        print(f"Timeout na requisição da linha {linha}")
    except requests.ConnectionError:
        print(f"Erro de conexão na linha {linha}")
    except Exception as e:
        print(f"Erro na requisição da linha {linha}: {str(e)}")





         
