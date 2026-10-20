.class public abstract Lf2/g;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf2/u;

.field public static final b:La4/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf2/u;

    invoke-direct {v0}, Lf2/u;-><init>()V

    sput-object v0, Lf2/g;->a:Lf2/u;

    new-instance v0, La4/q;

    invoke-direct {v0}, La4/q;-><init>()V

    sput-object v0, Lf2/g;->b:La4/q;

    return-void
.end method
