cd lab0
ls -R -l 2>/tmp/script45_errors| sort | grep -v "/" | grep -v "total" | tail -n 4

