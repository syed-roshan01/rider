.class public abstract Lt/i2;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Lt/y1;->b:Lt/x1;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Lq8/f;

    invoke-direct {v3, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lt/y1;->h:Lt/x1;

    new-instance v4, Lq8/f;

    invoke-direct {v4, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Lm2/i;->c:I

    sget-object v1, Lt/y1;->g:Lt/x1;

    new-instance v5, Lq8/f;

    invoke-direct {v5, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lt/y1;->a:Lt/x1;

    const v2, 0x3c23d70a    # 0.01f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v6, Lq8/f;

    invoke-direct {v6, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lt/y1;->i:Lt/x1;

    new-instance v7, Lq8/f;

    invoke-direct {v7, v1, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ld1/f;->d:I

    sget-object v1, Lt/y1;->e:Lt/x1;

    new-instance v8, Lq8/f;

    invoke-direct {v8, v1, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ld1/c;->e:I

    sget-object v1, Lt/y1;->f:Lt/x1;

    new-instance v9, Lq8/f;

    invoke-direct {v9, v1, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lt/y1;->c:Lt/x1;

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v10, Lq8/f;

    invoke-direct {v10, v0, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lm2/f;->c:I

    sget-object v0, Lt/y1;->d:Lt/x1;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v11, Lq8/f;

    invoke-direct {v11, v0, v1}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v3 .. v11}, [Lq8/f;

    move-result-object v0

    invoke-static {v0}, Lr8/v;->D0([Lq8/f;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lt/i2;->a:Ljava/util/Map;

    return-void
.end method
