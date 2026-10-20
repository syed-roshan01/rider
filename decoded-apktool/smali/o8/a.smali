.class public final Lo8/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lo8/c;

.field public static final b:La4/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo8/c;

    invoke-direct {v0}, Lo8/c;-><init>()V

    sput-object v0, Lo8/a;->a:Lo8/c;

    new-instance v0, La4/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo8/a;->b:La4/q;

    return-void
.end method
