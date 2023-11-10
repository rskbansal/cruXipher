from PIL import Image, ImageChops

lock = Image.open('encrypted_lock.png')
lock = lock.convert('RGB')
print(lock.size, lock.mode)
key = Image.open('key.jpg')
print(key.size, key.mode)

def get_concat_h(im1, im2):
    if im1 == None:
        return im2
    dst = Image.new('RGB', (im1.width + im2.width, im1.height))
    dst.paste(im1, (0, 0))
    dst.paste(im2, (im1.width, 0))
    return dst

def get_concat_v(im1, im2):
    if im1 == None:
        return im2
    dst = Image.new('RGB', (im1.width, im1.height + im2.height))
    dst.paste(im1, (0, 0))
    dst.paste(im2, (0, im1.height))
    return dst

res = None
for i in range(0,700,70):
    res_h = None
    for j in range(0,1400,70):
        res_new = ImageChops.subtract(lock.crop((j,i,j+69,i+69)),key)
        res_h = get_concat_h(res_h, res_new)
    res = get_concat_v(res, res_h)

res.save('output.png')
