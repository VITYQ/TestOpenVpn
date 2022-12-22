package com

object Certificate {
    val cert = "###############################\n" +
            "# FreeOpenVPN.Org config file #\n" +
            "# https://www.freeopenvpn.org #\n" +
            "###############################\n" +
            "\n" +
            "setenv UV_ID ec895562d9e04d61a0c3f420efe87b3f\n" +
            "setenv UV_NAME guarded-plains-5491\n" +
            "client\n" +
            "dev tun\n" +
            "dev-type tun\n" +
            "remote nl1.freeopenvpn.org 19697 udp\n" +
            "nobind\n" +
            "persist-tun\n" +
            "cipher AES-128-CBC\n" +
            "auth SHA1\n" +
            "verb 2\n" +
            "mute 3\n" +
            "push-peer-info\n" +
            "ping 10\n" +
            "ping-restart 60\n" +
            "hand-window 70\n" +
            "server-poll-timeout 4\n" +
            "reneg-sec 2592000\n" +
            "sndbuf 393216\n" +
            "rcvbuf 393216\n" +
            "max-routes 1000\n" +
            "remote-cert-tls server\n" +
            "comp-lzo no\n" +
            "auth-user-pass\n" +
            "key-direction 1\n" +
            "<ca>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIFcTCCA1mgAwIBAgIIdO1gfGEKRc4wDQYJKoZIhvcNAQELBQAwRjEhMB8GA1UE\n" +
            "CgwYNWUxMWM5ZTRjNDdiMjE2NzUxOWU5ZWY2MSEwHwYDVQQDDBg1ZTExYzllNGM0\n" +
            "N2IyMTY3NTE5ZTlmMDMwHhcNMjAwMTA1MTEzNTAyWhcNMzAwMTA0MTEzNTAyWjBG\n" +
            "MSEwHwYDVQQKDBg1ZTExYzllNGM0N2IyMTY3NTE5ZTllZjYxITAfBgNVBAMMGDVl\n" +
            "MTFjOWU0YzQ3YjIxNjc1MTllOWYwMzCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCC\n" +
            "AgoCggIBAMOtLDbGpnbgVLyQrK2OySQIGW8MgDYKzR9vxTAoR33J9IFBJGB80rkl\n" +
            "M85gFthUdkhGvp1on46+IoLMvPr8Af7HM/cU43l2a+qhPAiGWjNt254QmTOcfAtl\n" +
            "P2tUwseEEf0k2o/9zDFjwi4cyyK3iFPpuju1aGdacFitFqoPXWSxL8T29QqqIEb+\n" +
            "tAccy0a+dZBjWog9sn8Xf18LAG07dP4cgINsE4vz0pR77yHNr1LKXUrOlNiSJoLy\n" +
            "X4thasUmwAqvDjCNuhBlCjue2d5iS5+ofY6L+kkUKMdFevCL8BXVd7EcFY1Llg6V\n" +
            "3nASqGSp6qHl2RhlyD7Qls4CIOeV6iLnaCsEMFuF9XUTb6AoksUpaK5H4ePZjPjt\n" +
            "BxLoJ5mkejcBN/5vXU2t8YBX5g+D3eNV7RTZ4zfYV774CeQNFC9gZQdD8ZK+g/6b\n" +
            "9tj8RRPaWFR1sZcQ8VbOyEOdtIcaqkjZSVml0IsMb44QOObnDMpPYTeZXlDDtOu9\n" +
            "0D90tXf3AFFmcxao/lGttUfwfGJwIn//3YNJsdBpL4hUu72POMtQ9H2Qs/NX1Wlx\n" +
            "HBfa/VvVlDhxsNWZIwyiOcxMxxIZjFKzBUUH1uwl5QA4wcog6jWaSg+zh+t31JxI\n" +
            "6lybVlOun0zhjrCVLegYrG/N9m4OWLpUOd4XOljhPOzyf+UFyhfjAgMBAAGjYzBh\n" +
            "MA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBThyxjz\n" +
            "+6+bbX/a2faD4X/Tsx9QijAfBgNVHSMEGDAWgBThyxjz+6+bbX/a2faD4X/Tsx9Q\n" +
            "ijANBgkqhkiG9w0BAQsFAAOCAgEAivjqhn+Q6CyvSDQrVd+4Kpp9dR0kmGZFJF4R\n" +
            "gyU6iAvzWpJSZsyq1vsBryygkCn/kuAIac/YxJ0LuXcjMDyMbE9HKDNvA4fmB6WA\n" +
            "OaGg57V0RD37h5LuT2DC6+js2TWRMslIYLHM0I+Ea0KNrf9rHNN8zCQoR6FqfeQ2\n" +
            "rwH3p3UTq69+at66QcTVw4lWK1zqy2XLDXgExTwLhPixQtab/RvKH/D8HgXzyl6q\n" +
            "vRJNzxACVR1nJi6azC53YJv8i4uOj4ALSxFOH0u7fnsM5vmAAYBzj0LA/2W4IWaR\n" +
            "NQazHh28szy/rO/Xx8MrsAtK0+VxbwXTo+wy3XUlXbKVTVYu+1CuY/6+isXPag0O\n" +
            "bzsvXw6jpRwt/EWqFS7ajH0Ec2r/sbVrqfyWmSPcmxUqXgv82zOjXPCdAKrgGbMC\n" +
            "K6JNJLzLLm8p22icSVeArhACev/9cAIi73UFjYrbTWGgHMVlnVVUt02nhnZBbLAr\n" +
            "t76mnp5SldBCl1u4JnQ7T9JmhUtH+v8iMbV163dDUz3zQBBu0brs/xyrUEdEoaYK\n" +
            "BMqYVYg8J0217qyRco2yJ3ETbXPtop7rnXaiWWDMXCWTZocFgJ87vlZjzRVTvw+S\n" +
            "P0Wc3yUNNFv0aT0SAa+5AoXB/H7SH6IzaoXv/B5yMrOGtWLyd/xUTju5D93lTpto\n" +
            "HVvA7QU=\n" +
            "-----END CERTIFICATE-----\n" +
            "</ca>\n" +
            "<tls-auth>\n" +
            "#\n" +
            "# 2048 bit OpenVPN static key\n" +
            "#\n" +
            "-----BEGIN OpenVPN Static key V1-----\n" +
            "8322416e2f72d5f5e301bc37acc2f2bf\n" +
            "b2d1ee50d72da8f019b0b0c1ec17ec2e\n" +
            "5014ba145364c8c8b710f48d061d4e88\n" +
            "c9975753a9f3a9753ffd37e8f96bce2e\n" +
            "a4719e28a14d0fad562fc5687bbb4f60\n" +
            "a35bfbdaa730d5730ddc610eb5302a93\n" +
            "1a5d5335e5bd9f1468c4000e17739ac0\n" +
            "52294dff1edea2ae1760d66bca614ca2\n" +
            "76fdf503aa5061bf4292d6ce92f573f6\n" +
            "1cbd9d4dc1077e48bf4c5ad4b0479034\n" +
            "3b1ac074333b99aafa2c303911d4a2bd\n" +
            "ff3b488595316c3c0f9490a6aa9f73b7\n" +
            "61fc58b92e52ebf470c33b03eb794153\n" +
            "1e59ae1c02429ab04d3fd00f2b0b6eea\n" +
            "e08f5bffbd02c4cd6d8424ab076d0bb5\n" +
            "ad32f4780250a7cb83b64faf62c1bd05\n" +
            "-----END OpenVPN Static key V1-----\n" +
            "</tls-auth>\n" +
            "<cert>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIFgDCCA2igAwIBAgIIVKpzCK4eqikwDQYJKoZIhvcNAQELBQAwRjEhMB8GA1UE\n" +
            "CgwYNWUxMWM5ZTRjNDdiMjE2NzUxOWU5ZWY2MSEwHwYDVQQDDBg1ZTExYzllNGM0\n" +
            "N2IyMTY3NTE5ZTlmMDMwHhcNMjAwMTA1MTEzNTAzWhcNMzAwMTA0MTEzNTAzWjBG\n" +
            "MSEwHwYDVQQKDBg1ZTExYzllNGM0N2IyMTY3NTE5ZTllZjYxITAfBgNVBAMMGDVl\n" +
            "MTFjOWU2YzQ3YjIxNjc1MTllOWYwNDCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCC\n" +
            "AgoCggIBAMdnqCz3ONajn1OSZMwHf9TJTl27NZ+k72efAahJOmpXa9Bno3IY/uG0\n" +
            "gYY/tQfF5VE1XFpzTBrgqQLk9ZA7H1JWhq/700iJVVBpB3nJAtj86jouqlGyjVR0\n" +
            "EL3t7jgpe32PV9TYsIhbNDEtN+xgqrTZC4LfyZbe4ypxjNWy4lF/CPQwlx3Bezwd\n" +
            "sIMtZ6ACeeq6rLEixAuTH5UozFCQXj+oIf3bCeXAdr0s/mq/qhtK6cVD0O72wNSD\n" +
            "U2rC8+IEQXpSt8vETj5TgWcLtuahF5++X4j00T4i/vriXiqGqz+yM3yfNuyXRiqN\n" +
            "ARLeZxZqG4hQZEaRoKp+jwLgLQOIVsyOtx6UCERvtpmHUoznwIGjgtg+EJfiD71z\n" +
            "QDTIkczd8SFfvpDkFxGj13I0Ca3c4I80pUDH3eyYU0GnKtUqlD3WKBrCjLrZjSEt\n" +
            "PqEEJx1BNg+4+zGYRexBhe1tXR9i+2T5xWWtrxpoo+g5GloqsjJXfuREj2pOWtsd\n" +
            "QNWUt2bhC524KBUbLBNAufLLiI+vME8HxR6Ga+tBz6+hHKBO4WW0Bs5sxGsHOtVp\n" +
            "ExT7LZ4rMSlekrkuEYK75R57Z3vbgthONEFjNt4YWNulJlRRnVQ1QSloajNWkaLK\n" +
            "7AlGHaISjIL9ZFGTvy07t8ZmTTPqs4ufKJWeObZ7D2Hoa5FErWcLAgMBAAGjcjBw\n" +
            "MA4GA1UdDwEB/wQEAwIFoDAJBgNVHRMEAjAAMBMGA1UdJQQMMAoGCCsGAQUFBwMC\n" +
            "MB0GA1UdDgQWBBQ4U/L2Xh5Zb3M1IVuXdaIoJNYX7jAfBgNVHSMEGDAWgBThyxjz\n" +
            "+6+bbX/a2faD4X/Tsx9QijANBgkqhkiG9w0BAQsFAAOCAgEAq6lIKCoF2YAF88S8\n" +
            "zewoaozJZexgzuRKFU8o5rFNPhLWhHTzcwXae9xAYrjYCNOKW5GBvrZRQHrGuL8s\n" +
            "jYABKjOtAI3ZQftUNZeldsSAshPJB5jBXEsgSa+NlYJaCK7xQQl0qtKb9coljlrg\n" +
            "r9Sa3BxKEMJfj0YHBSDdJ2dTSnShHjKJGVOvA0Sogo0o2595dbFs1MU4HZYirzj4\n" +
            "dvLGGVqcf8i/I6V0EBXIZK6yIrrY7xv6MFk/PFOgOBSNtzjLTC6ScCAuRIec7sY2\n" +
            "ZxZGxydwullRHS+TJJNOdUiP69ml2Ovn9L8TMZ8t8t2dGTwMu9QZsnnLjHJXxIAe\n" +
            "HuahCYzgok7J8H4/bugPpmw+HNh0V5qXy/6EwnIfASbxfL6WQNPOW7m5QM5nXJ8U\n" +
            "QdfxvAyCVEG6FYSfWR6DMgMX2nN0SzXSnZEXZh+hwmMobm89NWyltBJDX1L6xS4s\n" +
            "ujsJ71Zh6CqCagFFg3l9me3CZRFtqLoX14RjaFGU7QvBwmkueWQ/Ty1atTxAG0aJ\n" +
            "UZhYuJ63RTLWyBooUlaxjgM/KRxr7N7y2lvF43BTMzSDNYzjmnKXl0vltjFsmrrD\n" +
            "Y3IvVQPFpD96TeVj4not2O60nTa4g9tpg+RZqlES4GxEw1mDud5KvOF+YHZSX4VQ\n" +
            "FXdwyzCtG0O+jXl7meNdX+tMYcU=\n" +
            "-----END CERTIFICATE-----\n" +
            "</cert>\n" +
            "<key>\n" +
            "-----BEGIN PRIVATE KEY-----\n" +
            "MIIJQwIBADANBgkqhkiG9w0BAQEFAASCCS0wggkpAgEAAoICAQDHZ6gs9zjWo59T\n" +
            "kmTMB3/UyU5duzWfpO9nnwGoSTpqV2vQZ6NyGP7htIGGP7UHxeVRNVxac0wa4KkC\n" +
            "5PWQOx9SVoav+9NIiVVQaQd5yQLY/Oo6LqpRso1UdBC97e44KXt9j1fU2LCIWzQx\n" +
            "LTfsYKq02QuC38mW3uMqcYzVsuJRfwj0MJcdwXs8HbCDLWegAnnquqyxIsQLkx+V\n" +
            "KMxQkF4/qCH92wnlwHa9LP5qv6obSunFQ9Du9sDUg1NqwvPiBEF6UrfLxE4+U4Fn\n" +
            "C7bmoRefvl+I9NE+Iv764l4qhqs/sjN8nzbsl0YqjQES3mcWahuIUGRGkaCqfo8C\n" +
            "4C0DiFbMjrcelAhEb7aZh1KM58CBo4LYPhCX4g+9c0A0yJHM3fEhX76Q5BcRo9dy\n" +
            "NAmt3OCPNKVAx93smFNBpyrVKpQ91igawoy62Y0hLT6hBCcdQTYPuPsxmEXsQYXt\n" +
            "bV0fYvtk+cVlra8aaKPoORpaKrIyV37kRI9qTlrbHUDVlLdm4QuduCgVGywTQLny\n" +
            "y4iPrzBPB8UehmvrQc+voRygTuFltAbObMRrBzrVaRMU+y2eKzEpXpK5LhGCu+Ue\n" +
            "e2d724LYTjRBYzbeGFjbpSZUUZ1UNUEpaGozVpGiyuwJRh2iEoyC/WRRk78tO7fG\n" +
            "Zk0z6rOLnyiVnjm2ew9h6GuRRK1nCwIDAQABAoICAEPzeebg1FioZ3n2MC0q/Q/J\n" +
            "DdB5JFvju8WG9OyhD6v/YHkjaBpQlELb3SufeBRPBsc2tOMJ2UxrdIzM8zWUQCcx\n" +
            "3zIHUcetLQp60BZbPoItJbBwCJBQlULLTo06kGxJDpEKEPcyZG4DDnUXoLAHfQSl\n" +
            "1ftiQXMNP0JOcZy9GcyFyspT6Js2PMWOpID/Lwni7iLkPEccvsvm9eNBhOaLW+K7\n" +
            "a+HzC5tki9IJjCVabSBh1enoI0HbinigzANcrfk+VAXYPFPO8I7iq/0ui8Rp7v/7\n" +
            "wtiL/OX8zQE3tLkvLRpGoq78Hp5fKoUDifMhIOYNgJZiNtmpdKPE/v0O4agLhPAT\n" +
            "9D+q4u2kqlIipuSzs5068DSjLWx+xd/bggHLpJ5fDDi3CiXCWgh+5XAaL0l65uYt\n" +
            "eiw+K93kvFTtZrQ+/XZc2cvcDvUk7KUcVx577Q/3ilBtJgMgn0oWhXkQ0q8Ar7kB\n" +
            "KJ9TqBoNJoFMrF0tWourjFZV01XbeDpIU06H9J2W4K4SWg2Il+zI4Fi7Ko+1Invv\n" +
            "OC8Sn/6OPlqDj4fBh4YIjNcARJHVjxGl9H6L7NeDvj/vVFg3m/8CR0di72jO954p\n" +
            "A63VGAD0G06FUtyrc1yCx9TY5QykQYfrN2wHT/D+mD4G5x1BH9jFKQ1HE+7E54Sf\n" +
            "1weHTTlvsss8OMhCGHBZAoIBAQDyAzgXvCWeH3PG89bmUZtuIoMpbkuT7a7T2+5a\n" +
            "1QFiGwBfYf/yHXlRQU2l0Xac3ngcmmAYdf4K0LZ9Lq0eoFvXZ5Nu7qSTMYEX7Ghg\n" +
            "QXCN18WDU8pGFf1iPB18tcNzkzd8kOD3O3w13tvAG7RO62utEqHz0eWkRP8TIXzw\n" +
            "QjO7PofZw7mQOTHeWhXX36KfkFkT+YmSgsz7fYBnoT+rF0X95gEh1AroQXfFL9UV\n" +
            "f4QQTfgJgPFjjXVcfp9CSu1TAP8/cAsybXm2GpuxQ4NK89c9jhsmMYrhatjU5ljq\n" +
            "wzmUG9GMDwsCOzsnfjk+Fd337qL0a6gUTZBRGsCi0m4ADkPPAoIBAQDS7gV31NrQ\n" +
            "cc3DSuwI4WQcNdgqWvrb/j1rzIa9QxUCpPHLW+F3UDXJ53XXzoJaPgdRE+EVGmtU\n" +
            "ngBCmZdjkQ61SOfSl/yH1g9I3fSbjrIXvs659ASnKBiHyTE40LgXoh1Q/FhHiyeQ\n" +
            "+gCA3LJVVPApAdPnPWym5dJQDPM0X0+asj1wKevXXcpHBcfvO1qgYxeZZdWMVNsH\n" +
            "5TW5lyAdXIVi2he7NgupQ1ss5s8NUG8Vfb0XoBXmRsPEOXC4WgMYPx8CHQE2O8Gq\n" +
            "z8CMGM6AKBKrvhwzXdw+Sc5R3sUJ9Kv7J0QzM+q8mmcOsLbYlM49zT9s2p+5n0sq\n" +
            "uJC7FLC+eawFAoIBAQDop7WWA7b6Muxfd+zBD/TnROBoxPJ9LILkgsq6oYkp4iFS\n" +
            "kOi3viPxvGDEJwDrP2eiv7nf6hamGQ1GfMfK6IhCJP10KJEoO/AJqqiQ2Hg2tBbZ\n" +
            "8IRFKkCj3nzOdgKGqiEubC0JIDOBqlQBc+C7+dBS2tW8iq1EZVv97TSp2ErZF/0L\n" +
            "mQBcKM/LHTlghUpWMTOhY0QhCAO9RWJavYZymPYdZq7x8WHm84ELnLcxapvv/LSV\n" +
            "llL4zHXlzIiX92X9ZLj9KF5rRRk7uoqwN+IQ/SePsnxhFEGaANigmy0hyzogKzog\n" +
            "dhm0NHLivZKUH/t6rPwVEyXLFuHFRn2oSbmb7hq7AoIBAFUEKOIOwg9H/2ZamV5O\n" +
            "8lnIfhM8TmZDSCBd9GTuV9aUAv0zUGIVy0hQ6ZeNHc8ftzU/rPYjiuU1NeeiHnm8\n" +
            "KtB4zS99oQRjDBATnhbg4fleJ9adew6gw5pfRl6fCcREzEorG63icZUmnvNRgPOR\n" +
            "46aznORURqnScf1f6trOG7i/ZLIDw5IvtGsB8n8DTljc99MVT4hbX1kEUq42MnSD\n" +
            "KSQZwXzsoLCdfG9RrFyyccOYxZFzLcB9/0Pk3wD/DsZEEsx4QlfIqBuf1vzgtsLC\n" +
            "5Bui6ZzulOnqN6WaA5MqsfLt9bgpkdBo72blZR1QhPw18P1/9OcNRG+4qmUtRrvP\n" +
            "ML0CggEBAM8Vv+FV2sJqWF/xfR+cNO8SuPTNxbR4v6B/jRx9NYbTPVjjqDhbhlf2\n" +
            "5XHPzKP+C3aHYXnIq62xl0v1Mu9NJQbkT2k96hnASzK5Sb2thg2aPwKWUFD8aai+\n" +
            "n81xWJ2QljLZHsbESJ9VOfCOwGVw01X6bv/HqBKdXQR52TjCajrUToH39+FpBTYz\n" +
            "sKC+aA1MbEdMJpZbxtz/f58+OmVH3t+C8w+Z5z1b0oxJW96sR4LoO7kJbpdIVZYC\n" +
            "BgC1E4c5sfVpm1sRn01ElXKUu8H7Lza2OmC8HBBnty1NU6/vado91ZRg9nzZGI9S\n" +
            "fJGYbQerRIymJHejCFD1Yc30mXGE/dY=\n" +
            "-----END PRIVATE KEY-----\n" +
            "</key>"
}