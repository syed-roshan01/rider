.class public abstract Ll0/v;
.super Ljava/lang/Object;


# static fields
.field public static final a:La2/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v14, Ll2/g;

    sget v0, Ll2/f;->a:F

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1}, Ll2/g;-><init>(FI)V

    sget-object v11, La2/c0;->d:La2/c0;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    const-wide/16 v8, 0x0

    sget-object v10, Lk0/t0;->a:La2/t;

    const v1, 0xe7ffff

    invoke-static/range {v0 .. v14}, La2/c0;->a(IIJJJJLa2/t;La2/c0;Lf2/m;Lf2/l;Ll2/g;)La2/c0;

    move-result-object v0

    sput-object v0, Ll0/v;->a:La2/c0;

    return-void
.end method
