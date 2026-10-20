.class public abstract Lf2/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf2/b;

.field public static final b:Lf2/m;

.field public static final c:Lf2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf2/e;->a:Lf2/b;

    new-instance v0, Lf2/m;

    const-string v1, "sans-serif"

    const-string v2, "FontFamily.SansSerif"

    invoke-direct {v0, v1, v2}, Lf2/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lf2/e;->b:Lf2/m;

    new-instance v0, Lf2/m;

    const-string v1, "monospace"

    const-string v2, "FontFamily.Monospace"

    invoke-direct {v0, v1, v2}, Lf2/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lf2/e;->c:Lf2/m;

    return-void
.end method
