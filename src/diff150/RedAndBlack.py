

def dfs(x, y, mx, my):
    global tile
    global cnt
    if (x < 0) or (x > mx) or (y < 0) or (y > my):
        return
    if tile[x][y] == '#':
        return
    cnt += 1
    tile[x][y] = '#'
    dfs(x+1, y, mx, my)
    dfs(x-1, y, mx, my)
    dfs(x, y+1, mx, my)
    dfs(x, y-1, mx, my)


if __name__ == '__main__':
    global tile
    global cnt
    W, H = map(int, input().split())
    tile = [input() for i in range(H)]
    for i in range(H):
        sx, sy = tile[i].find('@'), i
        if sx > 0:
            break
    dfs(sy, sx, H, W)
    print(cnt)
